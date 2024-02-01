package com.infosys.core.models;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CustomImage {
	@ValueMapValue
    private String heroreferenceImage;
	
    private String backgroundStyle;
    
    @ValueMapValue
    private String heroTitle;
    
    @ValueMapValue
    private String heroButtonLink;
    
    @ValueMapValue
    private String heroButtonLabel;
 
    @PostConstruct
    public void init() {
        if (heroreferenceImage != null) {
            backgroundStyle = String.format("%s", heroreferenceImage);
        }
    }
 
    public String getBackgroundStyle() {
        return backgroundStyle;
    }

	public String getHeroreferenceImage() {
		return heroreferenceImage;
	}

	public String getHeroTitle() {
		return heroTitle;
	}

	public String getHeroButtonLink() {
		return heroButtonLink;
	}

	public String getHeroButtonLabel() {
		return heroButtonLabel;
	}
    
    
}
