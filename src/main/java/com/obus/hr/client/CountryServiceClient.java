package com.obus.hr.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.obus.hr.domain.GetCountryRequest;
import com.obus.hr.domain.GetCountryResponse;

public class CountryServiceClient extends WebServiceGatewaySupport {
   public GetCountryResponse getCountryDetails(String country){
      String uri = "http://localhost:9090/leaveService/";
      GetCountryRequest request = new GetCountryRequest();
      request.setName(country);

      GetCountryResponse response =(GetCountryResponse) getWebServiceTemplate()
         .marshalSendAndReceive(uri, request);
      return response;
   }
}