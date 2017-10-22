# identitytest

Execute Tests

Part 1:

Write a Service layer bean to do the following:


I've used data directory (identitytest/src/test/resources/data) as a source folder of files, it'll check all the subfolders if there is any.
Directory Utility provides the code to retrieve supported mime type files - it's been configured for excel and csv as required.
Junit tests demos to verify the xlsx and csv files.

unit tests

1. Verify that there is only 1 csv files in data source folder
2. Verify that there is only 1 excel files in data source folder
3. Verify that there are 4 files exist in data source folder

Please find the attached screenshot of test execution from command line for reference.

mvn test


Part 2:

1. I've written a selenium cucumber test to automate the DVLA website to verify the vehicle's details
2. It uses the DirectoryUtility class which was created in step 1 to retrieve the CSV file.
3. Test picks up the registration number from the csv file and verifies the Make and Colour of the vechile on DVLS website.
4. By default it's running on Firefox browser as i've provided browser:"firefox" in the config.properties file.
If you need to run on chrome on mac just change the property to chrome. Window's machine would require a 32 bit chromedriver.exe in testDrivers folder
and path needs to be updated with chromedriver.exe


Execute Cucumber Test -

Open the Test in the IDE e.g. Eclipse or Idea Intellij, right click on feature file and run it.

You can find the video here -

http://tinyurl.com/ybvkg9z6





