$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Addcustomer.feature");
formatter.feature({
  "name": "Addcustomer.feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "The user is in telecom page",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcustomerstepsall.the_user_is_in_telecom_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user click on add Customer",
  "keyword": "And "
});
formatter.match({
  "location": "Addcustomerstepsall.the_user_click_on_add_Customer()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Addtarif"
    }
  ]
});
formatter.step({
  "name": "The user filling all details with manual",
  "rows": [
    {
      "cells": [
        "fname",
        "asar"
      ]
    },
    {
      "cells": [
        "lname",
        "selenium"
      ]
    },
    {
      "cells": [
        "email",
        "asarmca12@gmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "chennai"
      ]
    },
    {
      "cells": [
        "phone",
        "9787222786"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Addcustomerstepsall.the_user_filling_all_details_with_manual(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Addcustomerstepsall.the_user_click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user should be displayed id",
  "keyword": "Then "
});
formatter.match({
  "location": "Addcustomerstepsall.the_user_should_be_displayed_id()"
});
formatter.result({
  "status": "skipped"
});
});