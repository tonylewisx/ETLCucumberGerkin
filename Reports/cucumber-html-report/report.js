$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SanityTests.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Author: LJA"
    },
    {
      "line": 2,
      "value": "# Version: 1.00"
    },
    {
      "line": 3,
      "value": "# Comment:"
    },
    {
      "line": 4,
      "value": "# 17/2/2020 - created"
    },
    {
      "line": 5,
      "value": "#"
    }
  ],
  "line": 8,
  "name": "Sanity Tests",
  "description": "",
  "id": "sanity-tests",
  "keyword": "Feature",
  "tags": [
    {
      "line": 7,
      "name": "@SanityTests"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "End of Run One",
  "description": "",
  "id": "sanity-tests;end-of-run-one",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Run one has ended",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "All phone numbers are removed",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Default phone number is used",
  "keyword": "Then "
});
formatter.match({
  "location": "ExecuteTests.run_one_ended()"
});
formatter.result({
  "duration": 341676400,
  "status": "passed"
});
formatter.match({
  "location": "ExecuteTests.all_phone_numbers_are_removed()"
});
formatter.result({
  "duration": 129400,
  "status": "passed"
});
formatter.match({
  "location": "ExecuteTests.incorrect_login()"
});
formatter.result({
  "duration": 2426400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "End of run one",
  "description": "",
  "id": "sanity-tests;end-of-run-one",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Run one has ended",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "One enters code 1234",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "The door opens",
  "keyword": "Then "
});
formatter.match({
  "location": "ExecuteTests.run_one_ended()"
});
formatter.result({
  "duration": 86000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 16
    }
  ],
  "location": "ExecuteTests.enter_password(String)"
});
formatter.result({
  "duration": 3395000,
  "status": "passed"
});
formatter.match({
  "location": "ExecuteTests.dorr_open()"
});
formatter.result({
  "duration": 51100,
  "status": "passed"
});
});