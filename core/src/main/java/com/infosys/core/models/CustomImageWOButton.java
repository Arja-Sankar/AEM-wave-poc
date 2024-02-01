package com.infosys.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CustomImageWOButton {

	@ValueMapValue
    private String imageWoBtnreferenceImage;
	
    private String backgroundStyle;
    
    @ValueMapValue
    private String imageWoBtnText;
    
    @PostConstruct
    public void init() {
        if (imageWoBtnreferenceImage != null) {
            backgroundStyle = String.format("%s", imageWoBtnreferenceImage);
        }
    }
 
    public String getBackgroundStyle() {
        return backgroundStyle;
    }

	public String getImageWoBtnreferenceImage() {
		return imageWoBtnreferenceImage;
	}

	public String getImageWoBtnText() {
		return imageWoBtnText;
	}

    
}
