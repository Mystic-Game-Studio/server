package me.marcelschr.cardgame.engine

/**
 * CardEngine is the class that executes all the business logic. This includes
 * both the general game rules, but also the effects of the cards, since each
 * effect will be executed differently and has different constraints
 *
 * The engine itself is stateless. All state is passed to the engines functions
 * from the outside. The passed will then be manipulated by the engine. Since
 * the engine is a singleton, everyone can just consume it. In order to prevent
 * race conditions, the engine performs locking on the given state objects.
 */
object CardEngine {
}