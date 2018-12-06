/*
 * generated by Xtext 2.16.0
 */
package mx.kukulkan.dsl.usecase.validation

import org.eclipse.xtext.validation.Check
import mx.kukulkan.dsl.usecase.useCase.UseCasePackage
import org.eclipse.xtext.xtext.generator.ui.quickfix.QuickfixProviderFragment2
import mx.kukulkan.dsl.usecase.useCase.Model
import mx.kukulkan.dsl.usecase.useCase.Entity

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class UseCaseValidator extends AbstractUseCaseValidator {

//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					UseCasePackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	@Check
	def void checkNameStartsWithCapital(Entity entity) {
		if (!Character.isUpperCase(entity.name.charAt(0))) {
			warning("Name should start with a capital", UseCasePackage.Literals.ENTITY__NAME)
		}
	}

	@Check
	def void checkUniqueEntityName(Entity entity) {
		val model = entity.eContainer as Model
		for (extEntity : model.entities) {
			if (extEntity.name.equals(entity.name) && extEntity != entity) {
				error('Duplicated entity name', UseCasePackage.Literals.ENTITY__NAME, 'duplicatedEntityName')
			}
		}
	}
}
