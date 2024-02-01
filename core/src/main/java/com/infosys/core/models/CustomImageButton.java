package com.infosys.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class CustomImageButton {
	@ValueMapValue
    private String imageBtnreferenceImage;
	
    private String backgroundStyle;
    
    @ValueMapValue
    private String imageBtnPrimaryText;
    
    @ValueMapValue
    private String imageBtnSecondaryText;
    
    @ValueMapValue
    private String imageButtonLink;
    
    @ValueMapValue
    private String imageButtonLabel;
 
    @PostConstruct
    public void init() {
        if (imageBtnreferenceImage != null) {
            backgroundStyle = String.format("%s", imageBtnreferenceImage);
        }
    }
 
    public String getBackgroundStyle() {
        return backgroundStyle;
    }

	public String getImageBtnreferenceImage() {
		return imageBtnreferenceImage;
	}

	public String getImageBtnPrimaryText() {
		return imageBtnPrimaryText;
	}

	public String getImageBtnSecondaryText() {
		return imageBtnSecondaryText;
	}

	public String getImageButtonLink() {
		return imageButtonLink;
	}

	public String getImageButtonLabel() {
		return imageButtonLabel;
	}

	
}
