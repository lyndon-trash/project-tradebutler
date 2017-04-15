package com.lbibera.tradebutler.datacore.corporation.rest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.transaction.Transactional;

import static org.hamcrest.Matchers.is;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Ideally we should be mocking the repository,
 * unfortunately, Spring has no easy way of allowing this.
 *
 * Hence, we are stuck with inserting actual data.
 */
@Transactional @Sql
@RunWith(SpringRunner.class)
@SpringBootTest
public class CorporationRestTest {

    @Rule //This bit is for creating Spring REST Docs
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-snippets");

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
                .apply(documentationConfiguration(this.restDocumentation))
                .build();
    }

    /**
     * For future reference:
     * https://www.tothepoint.company/blog/spring-rest-doc/
     *
     * For More Details:
     * http://docs.spring.io/spring-restdocs/docs/current/reference/html5/
     *
     * @throws Exception
     */
    @Test
    public void getWithCorporationsShouldReturnAValidResponse() throws Exception {
        this.mockMvc
                .perform(get("/corporations").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.page.totalElements", is(2)))
                .andExpect(jsonPath("$.page.totalPages", is(1)))
                .andDo(document("corporations-list"));
    }

}
