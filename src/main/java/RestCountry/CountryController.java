package RestCountry;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    
    CountryClass unitedStates = new CountryClass(0, "United States", "Washington D.C.", 327000000);
    CountryClass unitedKingdom = new CountryClass(1, "United Kingdom", "London", 69000000);
    CountryClass france = new CountryClass(2, "France", "Paris", 68000000);
    CountryClass spain = new CountryClass(3, "Spain", "Madrid", 47000000);
    CountryClass germany = new CountryClass(4, "Germany", "Berlin", 83000000);
    
    CountryClass country = new CountryClass();
    List<CountryClass> countryList = new ArrayList<CountryClass>();    
    
    @GetMapping("/country") 
    public List<CountryClass> printAllCountries()
    {
    	countryList.add(unitedStates);
    	countryList.add(unitedKingdom);
    	countryList.add(france);
    	countryList.add(spain);
    	countryList.add(germany);
    	
    	return countryList; 
    }
    
//    @GetMapping("/country") 
//    public String printCountries()
//    {
//    	String resultString = " ";
//    	countryList.add(unitedStates);
//    	countryList.add(unitedKingdom);
//    	countryList.add(france);
//    	countryList.add(spain);
//    	countryList.add(germany);
//    	
//    	for(CountryClass i : countryList)
//    	{
//    		String temp = i.getName()+ " " + i.getCapital();
//    		resultString.concat(temp + " ");
//    	}
//    	
//    	System.out.println(resultString);
//    	
//    	return resultString; 
//    }
    
    @GetMapping("/country/population/{name}") 
    public String countryQuery(@PathVariable String name)
    {
    	switch(name) {
    	case "unitedstates":
			country = unitedStates;
			break;
		case "unitedkingdom":
			country = unitedKingdom;
			break;
		case "france":
			country = france;
			break;
		case "spain":
			country = spain;
			break;
		case "germany":
			country = germany;
			break;
		default:
			System.out.println("Invalid Input");
			break;
    	}
    	
    	String resultString = country.getName() + "'s Population is: " + country.getPopulation();  	
    	 
    	return resultString; 
    }
}
