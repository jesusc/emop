package mop.emf.annotations;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * Defines a library applicable at the meta-model level.
 * 
 * @author jesus
 */
public abstract class MetamodelLibrary extends AbstractLibrary {

	public abstract void process(Resource metamodel);	

}
