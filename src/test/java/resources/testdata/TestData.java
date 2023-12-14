package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    /**
     * |jobTitle|location|distance|salaryMin|salaryMax|salaryType|jobType|result|
     * |Tester|Harrow| up to 5 miles|30000|500000|Per annum| Permanent|Permanent Tester jobs in Harrow on the Hill|
     * Create 6 More data set.
     */
        @DataProvider(name = "JobSearchData")
        public Object[][] getDataForJobSearch(){
            Object[][] data = new Object[][]{

                    {"Tester", "Harrow","5 miles", "30000", "50000", "Per annum",
                            "Permanent","Permanent Tester jobs in Harrow "},
                    {"Scrum Master", "London","10 miles", "70000", "80000", "Per annum",
                            "Permanent","Permanent Scrum Master jobs in London "},
                    {"Test Manager", "Southampton", "5 miles", "70000", "80000", "Per annum",
                            "Permanent","Permanent Test Manager jobs in Southampton"},
                    {"IT Developer", "Birmingham", "10 miles", "40000", "60000", "Per annum",
                            "Permanent","Permanent It Developer jobs in Birmingham"},
                    {"Automation Tester", "Bristol(County)","15 miles", "40000", "50000",
                            "Per annum", "Permanent","Permanent Automation Tester jobs in Bristol (County)"},
                    {"Business analyst","Cardiff","10 miles", "30000", "60000", "Per annum",
                            "Permanent","Permanent Business Analyst jobs in Cardiff"}
            };
            return  data;
        }

    }
