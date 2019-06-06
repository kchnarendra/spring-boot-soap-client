package com.narendra.soap.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.narendra.soap.client.generated.pojos.school.StudentDetailsRequest;
import com.narendra.soap.client.generated.pojos.school.StudentDetailsResponse;

@RestController
public class SOAPRestConroller {
	
	@Autowired
	private SOAPConnector soapConnector;

	@PostMapping("test")
	public StudentDetailsResponse testSoapCall(@RequestBody TestDTO testDTO) {
		
		
		StudentDetailsRequest request = new StudentDetailsRequest();
		
		request.setName(testDTO.getName());
		
		StudentDetailsResponse response =(StudentDetailsResponse) soapConnector.callWebService("http://localhost:8080/service/student-details", request);
		
		/*System.out.println("-----------" + testDTO.getName() + "-----------");
		
		System.out.println("Got Response As below ========= : ");
		System.out.println("Name : "+response.getStudent().getName());
		System.out.println("Standard : "+response.getStudent().getStandard());
		System.out.println("Address : "+response.getStudent().getAddress());*/
		
		return response;
	}
}
