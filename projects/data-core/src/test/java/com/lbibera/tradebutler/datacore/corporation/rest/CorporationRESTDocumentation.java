package com.lbibera.tradebutler.datacore.corporation.rest;

import com.lbibera.tradebutler.datacore.corporation.model.Corporation;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CorporationRestDocumentation {

    @Rule
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-snippets");

    @Autowired
    private WebApplicationContext context;

    @MockBean
    private CorporationsRestRepository mockRepository;

    @Mock
    private Page<Corporation> mockResults;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
                .apply(documentationConfiguration(this.restDocumentation))
                .build();

        given(mockResults.getTotalElements()).willReturn(2L);
        given(mockResults.getTotalPages()).willReturn(1);

        Corporation bdo = new Corporation();
        Corporation smc = new Corporation();
        List<Corporation> mockCorporations = Arrays.asList(bdo, smc);
        given(mockResults.getContent()).willReturn(mockCorporations);
    }

    @Test
    public void getWithCorporationsShouldReturnAValidResponse() throws Exception {
        Pageable page = PageRequest.of(0, 1, Sort.Direction.ASC, "id");
        given(mockRepository.findAll(page)).willReturn(mockResults);

        this.mockMvc
                .perform(get("/corporations?page=0&size=10&sort=id").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(document("corporations-list"));
    }

}
