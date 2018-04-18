$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Cucumber/Cucumber/PageLaunch.feature");
formatter.feature({
  "name": "Automation Online Shopping",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sample Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user launches the web site",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.launchWebPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click SignIn enter required details",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.clickSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Launch Summer Dresses",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch Summer Dresses and select filter",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.launchDresses()"
});
formatter.result({
  "status": "passed"
});
});