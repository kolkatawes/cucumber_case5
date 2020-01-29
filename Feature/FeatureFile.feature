Feature: Register 

@Data-Driven 
Scenario: Register on TestMeApp 
	Given user open TestMeApp 
	When user click signup 
	And enter user name as "Madhusmita" 
	And enter first name as "Madhusmita" 
	And enter last name as "PandaSahu" 
	And enter password as "Madhusmita" 
	And enter confirm password as "Madhusmita" 
	And user select gender as "Female" 
	And enter email as "madhu@gmail.com" 
	And enter mobile number as "7789456155" 
	And enter DOB as "01/11/2020" 
	And enter address as "Rourkela,Odisha" 
	And select security question as "what is your favour color?" 
	And enter answer is "Blue" 
	Then user click Register 
	
@login 
Scenario: Login using datatable 
	Given user open TestMeApp 
	When user click signin 
	And user enter credentials as 
		|  lalitha  |
		|Password123|									
		
