$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/cucumber/features/Application.feature");
formatter.feature({
  "name": "Test Free CRM Web Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Application Landing Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Application Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on_Application_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user is on Application Landing Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verify_user_is_on_Application_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Loggin Area",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_the_Loggin_Area()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user is on the Loggin Area",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.Verify_user_is_on_the_Loggin_Area()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Application Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Application Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on_Application_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Loggin Area",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_the_Loggin_Area()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login FreeCRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.login_FreeCRM_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify User is on Application Home",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.verify_User_is_on_Application_Home()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Create New Contact in Application",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Application Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on_Application_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Loggin Area",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_the_Loggin_Area()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login FreeCRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.login_FreeCRM_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Open Contact Page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.open_Contact_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create New Contact clicking On Button Plus",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.create_New_Contact_clicking_on_button_plus()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});