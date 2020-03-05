Feature: Geoteric online Open Inventor Remote View

Scenario: Verify that the user can evaluate the siesmic results
	Given User launch the Inventor remote view application 
 	And user click close button on the shortcut viewing mode page
 	And user should get a sisemic volume page 
 	When user clicks spin button in sisemic volume page
 	And user rotate the image to 5,15
	Then user should get the sisemic data 
