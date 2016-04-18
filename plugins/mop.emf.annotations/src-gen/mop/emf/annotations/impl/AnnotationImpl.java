/**
 */
package mop.emf.annotations.impl;

import java.util.Collection;

import mop.emf.annotations.Annotation;
import mop.emf.annotations.AnnotationsPackage;
import mop.emf.annotations.SemanticAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mop.emf.annotations.impl.AnnotationImpl#getAnnId <em>Ann Id</em>}</li>
 *   <li>{@link mop.emf.annotations.impl.AnnotationImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link mop.emf.annotations.impl.AnnotationImpl#getReqs <em>Reqs</em>}</li>
 *   <li>{@link mop.emf.annotations.impl.AnnotationImpl#getForbids <em>Forbids</em>}</li>
 *   <li>{@link mop.emf.annotations.impl.AnnotationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link mop.emf.annotations.impl.AnnotationImpl#getOriginalAnnotation <em>Original Annotation</em>}</li>
 *   <li>{@link mop.emf.annotations.impl.AnnotationImpl#getSemanticHooks <em>Semantic Hooks</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnnotationImpl extends EClassImpl implements Annotation {
	/**
	 * The default value of the '{@link #getAnnId() <em>Ann Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnId()
	 * @generated
	 * @ordered
	 */
	protected static final String ANN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnId() <em>Ann Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnId()
	 * @generated
	 * @ordered
	 */
	protected String annId = ANN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReqs() <em>Reqs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqs()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> reqs;

	/**
	 * The cached value of the '{@link #getForbids() <em>Forbids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForbids()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> forbids;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject target;

	/**
	 * The cached value of the '{@link #getOriginalAnnotation() <em>Original Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EAnnotation originalAnnotation;

	/**
	 * The cached value of the '{@link #getSemanticHooks() <em>Semantic Hooks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticHooks()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticAction> semanticHooks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnId() {
		return annId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnId(String newAnnId) {
		String oldAnnId = annId;
		annId = newAnnId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION__ANN_ID, oldAnnId, annId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getReqs() {
		if (reqs == null) {
			reqs = new EObjectResolvingEList<Annotation>(Annotation.class, this, AnnotationsPackage.ANNOTATION__REQS);
		}
		return reqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getForbids() {
		if (forbids == null) {
			forbids = new EObjectResolvingEList<Annotation>(Annotation.class, this, AnnotationsPackage.ANNOTATION__FORBIDS);
		}
		return forbids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.ANNOTATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EObject newTarget) {
		EObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getOriginalAnnotation() {
		if (originalAnnotation != null && originalAnnotation.eIsProxy()) {
			InternalEObject oldOriginalAnnotation = (InternalEObject)originalAnnotation;
			originalAnnotation = (EAnnotation)eResolveProxy(oldOriginalAnnotation);
			if (originalAnnotation != oldOriginalAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.ANNOTATION__ORIGINAL_ANNOTATION, oldOriginalAnnotation, originalAnnotation));
			}
		}
		return originalAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation basicGetOriginalAnnotation() {
		return originalAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalAnnotation(EAnnotation newOriginalAnnotation) {
		EAnnotation oldOriginalAnnotation = originalAnnotation;
		originalAnnotation = newOriginalAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ANNOTATION__ORIGINAL_ANNOTATION, oldOriginalAnnotation, originalAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticAction> getSemanticHooks() {
		if (semanticHooks == null) {
			semanticHooks = new EObjectContainmentEList<SemanticAction>(SemanticAction.class, this, AnnotationsPackage.ANNOTATION__SEMANTIC_HOOKS);
		}
		return semanticHooks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.ANNOTATION__SEMANTIC_HOOKS:
				return ((InternalEList<?>)getSemanticHooks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.ANNOTATION__ANN_ID:
				return getAnnId();
			case AnnotationsPackage.ANNOTATION__URI:
				return getUri();
			case AnnotationsPackage.ANNOTATION__REQS:
				return getReqs();
			case AnnotationsPackage.ANNOTATION__FORBIDS:
				return getForbids();
			case AnnotationsPackage.ANNOTATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AnnotationsPackage.ANNOTATION__ORIGINAL_ANNOTATION:
				if (resolve) return getOriginalAnnotation();
				return basicGetOriginalAnnotation();
			case AnnotationsPackage.ANNOTATION__SEMANTIC_HOOKS:
				return getSemanticHooks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnnotationsPackage.ANNOTATION__ANN_ID:
				setAnnId((String)newValue);
				return;
			case AnnotationsPackage.ANNOTATION__URI:
				setUri((String)newValue);
				return;
			case AnnotationsPackage.ANNOTATION__REQS:
				getReqs().clear();
				getReqs().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AnnotationsPackage.ANNOTATION__FORBIDS:
				getForbids().clear();
				getForbids().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AnnotationsPackage.ANNOTATION__TARGET:
				setTarget((EObject)newValue);
				return;
			case AnnotationsPackage.ANNOTATION__ORIGINAL_ANNOTATION:
				setOriginalAnnotation((EAnnotation)newValue);
				return;
			case AnnotationsPackage.ANNOTATION__SEMANTIC_HOOKS:
				getSemanticHooks().clear();
				getSemanticHooks().addAll((Collection<? extends SemanticAction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AnnotationsPackage.ANNOTATION__ANN_ID:
				setAnnId(ANN_ID_EDEFAULT);
				return;
			case AnnotationsPackage.ANNOTATION__URI:
				setUri(URI_EDEFAULT);
				return;
			case AnnotationsPackage.ANNOTATION__REQS:
				getReqs().clear();
				return;
			case AnnotationsPackage.ANNOTATION__FORBIDS:
				getForbids().clear();
				return;
			case AnnotationsPackage.ANNOTATION__TARGET:
				setTarget((EObject)null);
				return;
			case AnnotationsPackage.ANNOTATION__ORIGINAL_ANNOTATION:
				setOriginalAnnotation((EAnnotation)null);
				return;
			case AnnotationsPackage.ANNOTATION__SEMANTIC_HOOKS:
				getSemanticHooks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnnotationsPackage.ANNOTATION__ANN_ID:
				return ANN_ID_EDEFAULT == null ? annId != null : !ANN_ID_EDEFAULT.equals(annId);
			case AnnotationsPackage.ANNOTATION__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case AnnotationsPackage.ANNOTATION__REQS:
				return reqs != null && !reqs.isEmpty();
			case AnnotationsPackage.ANNOTATION__FORBIDS:
				return forbids != null && !forbids.isEmpty();
			case AnnotationsPackage.ANNOTATION__TARGET:
				return target != null;
			case AnnotationsPackage.ANNOTATION__ORIGINAL_ANNOTATION:
				return originalAnnotation != null;
			case AnnotationsPackage.ANNOTATION__SEMANTIC_HOOKS:
				return semanticHooks != null && !semanticHooks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (annId: ");
		result.append(annId);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //AnnotationImpl
