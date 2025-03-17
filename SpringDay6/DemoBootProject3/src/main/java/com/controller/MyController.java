package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
		@Value("${my.website.name}")
		private String myWebsiteName;

		@RequestMapping(path = "/", method = RequestMethod.GET)
		public String welcome() {

			return "Welcome to " + myWebsiteName;
		}
}
