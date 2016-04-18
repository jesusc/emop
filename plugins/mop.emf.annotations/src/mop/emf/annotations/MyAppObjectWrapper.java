package mop.emf.annotations;

import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import freemarker.template.Version;

public class MyAppObjectWrapper extends DefaultObjectWrapper {

    public MyAppObjectWrapper(Version incompatibleImprovements) {
        super(incompatibleImprovements);
    }
    
    /** file:///home/jesus/freemarker/freemarker.org/docs/pgui_datamodel_objectWrapper.html#pgui_datamodel_defaultObjectWrapper */
    @Override
    protected TemplateModel handleUnknownType(final Object obj) throws TemplateModelException {       
    	return super.handleUnknownType(obj);
    }
    
    
}