package me.marcelschr.cardgame.engine

/**
 * Card reflects a specific card. For example "Odin, The Allfather".
 *
 * TODO Inheriting classes for Spell, Trap, Creature and Equippment?
 * TODO Think about how to embed Image into class
 * TODO Think about whether to auto-generate the text on instance creation.
 */
class Card(
    /** Unique Identifier of the card.
     *
     * TODO Change type to UUID?
     */
    val id: String,
    /**
     * Human readable name of the card.
     */
    val name: String, val type: CardType
) {
    val effects: List<Effect> = ArrayList()
}