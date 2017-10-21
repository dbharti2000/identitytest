# identitytest

Execute Tests

Part 1:

Write a Service layer bean to do the following:


I've used current project directory i.e. identity for scanning, it'll check all the subfolders e.g. src, java, test and target etc.
Service Layer provides the code to retrieve supported mime type files - it's been configured for excel and csv as required.
Junit tests demos to verify the xlsx and csv files.
Please find the attached screenshot of test execution from command line for reference.

mvn test


Part 2:

1. I've written a selenium cucumber test to automate the DVLA website to verify the vehicle's details
2. It uses the service layer created in step 1 to get the CSV file.
3. Test picks up the registration number from the csv file and verifies the Make and Colour of the vechile
4. By default it's running on chrome browser as i've provided browser:"chrome" in the config.properties file.


Execute Cucumber Test -

Open the Test in the IDE e.g. Eclipse or Idea Intellij, right click on feature file and run it.







