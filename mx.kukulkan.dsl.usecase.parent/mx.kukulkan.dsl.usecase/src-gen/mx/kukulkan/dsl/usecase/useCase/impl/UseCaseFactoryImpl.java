/**
 * generated by Xtext 2.16.0
 */
package mx.kukulkan.dsl.usecase.useCase.impl;

import mx.kukulkan.dsl.usecase.useCase.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseFactoryImpl extends EFactoryImpl implements UseCaseFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UseCaseFactory init()
  {
    try
    {
      UseCaseFactory theUseCaseFactory = (UseCaseFactory)EPackage.Registry.INSTANCE.getEFactory(UseCasePackage.eNS_URI);
      if (theUseCaseFactory != null)
      {
        return theUseCaseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UseCaseFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCaseFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UseCasePackage.REQUIREMENTS_USE_CASE_MODEL: return createRequirementsUseCaseModel();
      case UseCasePackage.ACTOR: return createActor();
      case UseCasePackage.CONCEPT: return createConcept();
      case UseCasePackage.USE_CASE: return createUseCase();
      case UseCasePackage.USE_CASE_FLOW: return createUseCaseFlow();
      case UseCasePackage.COMPLETE_ACTION_BLOCK: return createCompleteActionBlock();
      case UseCasePackage.SYSTEM_ACTION_BLOCK: return createSystemActionBlock();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementsUseCaseModel createRequirementsUseCaseModel()
  {
    RequirementsUseCaseModelImpl requirementsUseCaseModel = new RequirementsUseCaseModelImpl();
    return requirementsUseCaseModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concept createConcept()
  {
    ConceptImpl concept = new ConceptImpl();
    return concept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase createUseCase()
  {
    UseCaseImpl useCase = new UseCaseImpl();
    return useCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCaseFlow createUseCaseFlow()
  {
    UseCaseFlowImpl useCaseFlow = new UseCaseFlowImpl();
    return useCaseFlow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompleteActionBlock createCompleteActionBlock()
  {
    CompleteActionBlockImpl completeActionBlock = new CompleteActionBlockImpl();
    return completeActionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemActionBlock createSystemActionBlock()
  {
    SystemActionBlockImpl systemActionBlock = new SystemActionBlockImpl();
    return systemActionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCasePackage getUseCasePackage()
  {
    return (UseCasePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UseCasePackage getPackage()
  {
    return UseCasePackage.eINSTANCE;
  }

} //UseCaseFactoryImpl