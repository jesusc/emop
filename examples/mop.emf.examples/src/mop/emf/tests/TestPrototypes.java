package mop.emf.tests;

import java.io.IOException;

import mop.emf.annotations.Libraries;
import mop.emf.core.EMOP;
import mop.emf.libraries.proto.Prototypes;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

public class TestPrototypes extends TestUtils {

	public static void main(String[] args) throws IOException {
		
		Libraries.install(new Prototypes());

		// Common part
		EMOP.activate();
		
		ResourceSet rs = new ResourceSetImpl();
		Resource metamodel = rs.getResource(URI.createFileURI("examples/graphics/graphics.ecore"), true);
		Resource model     = rs.createResource(URI.createFileURI("tmp_/graphics.xmi"));
				
		// The root object
		EObject gm = createObject(metamodel, "GraphicalModel");
		setField(gm, "name", "A graphical model");
		model.getContents().add(gm);
		
		// Some objects
		EObject redCube = createObject(metamodel, "Cube");
		setField(redCube, "x", 1);
		setField(redCube, "color", "red");
		
		EObject redSphere = createObject(metamodel, "Sphere");
		setField(redSphere, "color", "red");
				
		// Create a clone of the red cube
		EObject redCubeBelow = Prototypes.clone(redCube);
		setField(redCubeBelow, "y", -1);
		
		Assert.assertEquals(-1, getField(redCubeBelow, "y"));
		Assert.assertEquals( 1, getField(redCubeBelow, "x"));
		Assert.assertEquals("red", getField(redCubeBelow, "color"));
		
		// May need to add annotations to have a way to save references between clones
		
		
		// Add to the model
		setField(gm, "objects", redCube, redSphere, redCubeBelow);

		
		System.out.println("Saving model with " + model.getContents().size() + " root elements");
		model.save(null);
	}

	
}
