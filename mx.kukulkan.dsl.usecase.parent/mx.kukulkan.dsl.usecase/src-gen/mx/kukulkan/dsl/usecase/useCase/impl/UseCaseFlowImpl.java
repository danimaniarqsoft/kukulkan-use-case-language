/**
 * generated by Xtext 2.16.0
 */
package mx.kukulkan.dsl.usecase.useCase.impl;

import java.util.Collection;

import mx.kukulkan.dsl.usecase.useCase.CompleteActionBlock;
import mx.kukulkan.dsl.usecase.useCase.UseCaseFlow;
import mx.kukulkan.dsl.usecase.useCase.UseCasePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mx.kukulkan.dsl.usecase.useCase.impl.UseCaseFlowImpl#getCompleteActionsBlock <em>Complete Actions Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseFlowImpl extends MinimalEObjectImpl.Container implements UseCaseFlow
{
  /**
   * The cached value of the '{@link #getCompleteActionsBlock() <em>Complete Actions Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompleteActionsBlock()
   * @generated
   * @ordered
   */
  protected EList<CompleteActionBlock> completeActionsBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UseCaseFlowImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UseCasePackage.Literals.USE_CASE_FLOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompleteActionBlock> getCompleteActionsBlock()
  {
    if (completeActionsBlock == null)
    {
      completeActionsBlock = new EObjectContainmentEList<CompleteActionBlock>(CompleteActionBlock.class, this, UseCasePackage.USE_CASE_FLOW__COMPLETE_ACTIONS_BLOCK);
    }
    return completeActionsBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UseCasePackage.USE_CASE_FLOW__COMPLETE_ACTIONS_BLOCK:
        return ((InternalEList<?>)getCompleteActionsBlock()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UseCasePackage.USE_CASE_FLOW__COMPLETE_ACTIONS_BLOCK:
        return getCompleteActionsBlock();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UseCasePackage.USE_CASE_FLOW__COMPLETE_ACTIONS_BLOCK:
        getCompleteActionsBlock().clear();
        getCompleteActionsBlock().addAll((Collection<? extends CompleteActionBlock>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UseCasePackage.USE_CASE_FLOW__COMPLETE_ACTIONS_BLOCK:
        getCompleteActionsBlock().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UseCasePackage.USE_CASE_FLOW__COMPLETE_ACTIONS_BLOCK:
        return completeActionsBlock != null && !completeActionsBlock.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UseCaseFlowImpl