package RestCountry;

import org.springframework.stereotype.Component;

@Component
public class CountryClass
{
	
	private int countryID;
	private String name;
	private String capital;
	private long population;

	public CountryClass() {}
	
	public CountryClass(int countryID, String name, String capital, long population)
	{
		this.countryID = countryID;
		this.name = name;
		this.capital = capital;
		this.population = population;
	}

	public int getCountryID()
	{
		return countryID;
	}

	public void setCountryID(int countryID)
	{
		this.countryID = countryID;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCapital()
	{
		return capital;
	}

	public void setCapital(String capital)
	{
		this.capital = capital;
	}

	public long getPopulation() 
	{
		return population;
	}

	public void setPopulation(long population)
	{
		this.population = population;
	}
}
