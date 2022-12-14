package com.project.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class UserRestController_getListUser {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper mapper;


    @Test
    public void getListUser_6() throws Exception {
        this.mockMvc.perform(
                MockMvcRequestBuilders.get("/api/useraaaaa/1"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("id").value(1))
                .andExpect(jsonPath("firstName").value("Nguyễn"))
                .andExpect(jsonPath("lastName").value("Thanh Hải"))
                .andExpect(jsonPath("email").value("a@gmail.com"))
                .andExpect(jsonPath("phone").value("092452345126"))
                .andExpect(jsonPath("pointDedication").value(100.0))
                .andExpect(jsonPath("birthDay").value("1999-03-12"))
                .andExpect(jsonPath("idCard").value("1"))
                .andExpect(jsonPath("address.id").value(1))
                .andExpect(jsonPath("userType").value(1))
                .andExpect(jsonPath("account.id").value(2));
    }




}
