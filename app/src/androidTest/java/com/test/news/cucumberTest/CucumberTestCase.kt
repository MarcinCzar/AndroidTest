package com.test.news.cucumberTest

import cucumber.api.CucumberOptions

@CucumberOptions(features = ["features"],
        glue = ["com.test.news.Test.StepDef"],
        tags = ["@e2e", "@smoke"])
@Suppress("unused")
class CucumberTestCase
