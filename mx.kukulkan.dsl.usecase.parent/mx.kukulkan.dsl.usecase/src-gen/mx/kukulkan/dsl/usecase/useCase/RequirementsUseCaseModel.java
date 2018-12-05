/**
 * generated by Xtext 2.16.0
 */
package mx.kukulkan.dsl.usecase.useCase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Use Case Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mx.kukulkan.dsl.usecase.useCase.RequirementsUseCaseModel#getActors <em>Actors</em>}</li>
 *   <li>{@link mx.kukulkan.dsl.usecase.useCase.RequirementsUseCaseModel#getData <em>Data</em>}</li>
 *   <li>{@link mx.kukulkan.dsl.usecase.useCase.RequirementsUseCaseModel#getUsecases <em>Usecases</em>}</li>
 * </ul>
 *
 * @see mx.kukulkan.dsl.usecase.useCase.UseCasePackage#getRequirementsUseCaseModel()
 * @model
 * @generated
 */
public interface RequirementsUseCaseModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
   * The list contents are of type {@link mx.kukulkan.dsl.usecase.useCase.Actor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actors</em>' containment reference list.
   * @see mx.kukulkan.dsl.usecase.useCase.UseCasePackage#getRequirementsUseCaseModel_Actors()
   * @model containment="true"
   * @generated
   */
  EList<Actor> getActors();

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference list.
   * The list contents are of type {@link mx.kukulkan.dsl.usecase.useCase.Concept}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference list.
   * @see mx.kukulkan.dsl.usecase.useCase.UseCasePackage#getRequirementsUseCaseModel_Data()
   * @model containment="true"
   * @generated
   */
  EList<Concept> getData();

  /**
   * Returns the value of the '<em><b>Usecases</b></em>' containment reference list.
   * The list contents are of type {@link mx.kukulkan.dsl.usecase.useCase.UseCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usecases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usecases</em>' containment reference list.
   * @see mx.kukulkan.dsl.usecase.useCase.UseCasePackage#getRequirementsUseCaseModel_Usecases()
   * @model containment="true"
   * @generated
   */
  EList<UseCase> getUsecases();

} // RequirementsUseCaseModel
