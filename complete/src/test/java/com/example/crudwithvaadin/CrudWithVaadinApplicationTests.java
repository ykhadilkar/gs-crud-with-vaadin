package com.example.crudwithvaadin;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.BDDAssertions.*;

@SpringBootTest(classes = CrudWithVaadinApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class CrudWithVaadinApplicationTests {

	@Autowired
	private CustomerRepository repository;

}
