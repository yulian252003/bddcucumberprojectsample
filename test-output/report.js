$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/cucumber/features/Application.feature");
formatter.feature({
  "name": "Test Free CRM Web Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.scenario({
  "name": "Verify Application Landing Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Application Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.LoginSteps.user_is_on_Application_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Verify user is on Application Landing Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.LoginSteps.verify_user_is_on_Application_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Loggin Area",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.LoginSteps.user_enters_the_Loggin_Area()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Verify user is on the Loggin Area",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.LoginSteps.Verify_user_is_on_the_Loggin_Area()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Application Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Application Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.LoginSteps.user_is_on_Application_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Loggin Area",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.LoginSteps.user_enters_the_Loggin_Area()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Login FreeCRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.LoginSteps.login_FreeCRM_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Verify User is on Application Home",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.HomePageSteps.verify_User_is_on_Application_Home()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Create New Contact in Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Application Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.LoginSteps.user_is_on_Application_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded8.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Loggin Area",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.LoginSteps.user_enters_the_Loggin_Area()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded9.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Login FreeCRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.LoginSteps.login_FreeCRM_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded10.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Open Contact Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.HomePageSteps.open_Contact_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded11.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Create New Contact clicking On Button Plus",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cucumber.stepdefinitions.HomePageSteps.create_New_Contact_clicking_on_button_plus()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded12.png", "image");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});