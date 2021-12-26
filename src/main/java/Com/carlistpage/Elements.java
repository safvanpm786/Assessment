package Com.carlistpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
	@FindBy(xpath="//div[@class='classified-search__body']/form/div/select/option[contains(text(),'All Condition')]")
	private WebElement Allconditionoption;
	
	@FindBy(xpath="//div[@class='classified-search__body']/form/div/select/option[contains(text(),'Used')]")
	private WebElement usedselectbox;
@FindBy(xpath="//body/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/form[1]/div[7]/button[1]")
private WebElement searchbutton;
@FindBy(xpath="/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/article[1]/div[1]/div[1]/h2[1]/a[1]\r\n"
		+ "")
private WebElement selectthefirstcar;
@FindBy(xpath="/html[1]/body[1]/main[1]/article[1]/section[1]/section[1]/section[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h3[1]")
private WebElement priceofthecar;

	public boolean verifyprice() {
		
		String price=priceofthecar.getText();
		String newprice = "";
		for(int i=1;i<price.length();i++){
		char c=price.charAt(i);
		if(c>='0'&& c<='9') {
			newprice=newprice+c;
		}
		}
		int p = Integer.parseInt(newprice);
		
		if(p>1000) 
			return true;
		return false;
	
		}
	
	

	public WebElement getSelectthefirstcar() {
	return selectthefirstcar;
}

public void setSelectthefirstcar(WebElement selectthefirstcar) {
	this.selectthefirstcar = selectthefirstcar;
}

	public WebElement getSearchbutton() {
	return searchbutton;
}

public void setSearchbutton(WebElement searchbutton) {
	this.searchbutton = searchbutton;
}

	public WebElement getUsedselectbox() {
		return usedselectbox;
	}

	public void setUsedselectbox(WebElement usedselectbox) {
		this.usedselectbox = usedselectbox;
	}
	

}
