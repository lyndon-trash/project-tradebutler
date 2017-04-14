package com.lbibera.tradebutler.datacore.corporation.rest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.JUnitRestDocumentation;
<<<<<<< HEAD
=======
import org.springframework.test.context.jdbc.Sql;
>>>>>>> experimental
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

<<<<<<< HEAD
=======
import javax.transaction.Transactional;

>>>>>>> experimental
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
<<<<<<< HEAD
public class CorporationRESTDocumentation {
=======
public class CorporationRestDocumentation {
>>>>>>> experimental

    @Rule
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-snippets");

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

<<<<<<< HEAD

=======
>>>>>>> experimental
    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
                .apply(documentationConfiguration(this.restDocumentation))
                .build();
    }

<<<<<<< HEAD
    @Test
=======
    @Transactional
    @Test @Sql("../repository/CorporationRepositoryTest.findByIdShouldReturnCorrectCorporation.sql")
>>>>>>> experimental
    public void getWithCorporationsShouldReturnAValidResponse() throws Exception {
        this.mockMvc
                .perform(get("/corporations").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(document("corporations-list"));
    }

}
