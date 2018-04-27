package com.obus.hr.ws;

import org.jdom.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.obus.hr.dao.CountryRepository;
import com.obus.hr.domain.Country;
import com.obus.hr.domain.GetCountryRequest;
import com.obus.hr.domain.GetCountryResponse;


@Endpoint
public class CountryEndPoint {
   private static final String NAMESPACE_URI = "http://tutorialspoint/hr/schemas";
   private CountryRepository countryRepository;

   @Autowired
   public CountryEndPoint(CountryRepository countryRepository) throws JDOMException {
      this.countryRepository = countryRepository;
   }
   @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
   @ResponsePayload
   public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) 
      throws JDOMException {
      
      Country country = countryRepository.findCountry(request.getName());
      GetCountryResponse response = new GetCountryResponse();
      response.setCountry(country);
      return response;
   }
}