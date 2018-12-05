/**
 * generated by Xtext 2.16.0
 */
package mx.kukulkan.dsl.usecase.useCase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Action Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mx.kukulkan.dsl.usecase.useCase.SystemActionBlock#getName <em>Name</em>}</li>
 *   <li>{@link mx.kukulkan.dsl.usecase.useCase.SystemActionBlock#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see mx.kukulkan.dsl.usecase.useCase.UseCasePackage#getSystemActionBlock()
 * @model
 * @generated
 */
public interface SystemActionBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see mx.kukulkan.dsl.usecase.useCase.UseCasePackage#getSystemActionBlock_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mx.kukulkan.dsl.usecase.useCase.SystemActionBlock#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see mx.kukulkan.dsl.usecase.useCase.UseCasePackage#getSystemActionBlock_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link mx.kukulkan.dsl.usecase.useCase.SystemActionBlock#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // SystemActionBlock
