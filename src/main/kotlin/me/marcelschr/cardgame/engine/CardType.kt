package me.marcelschr.cardgame.engine

/**
 * Specifies the base type of a card. This is not related to "creature tags".
 */
enum class CardType {
    CREATURE,
    SPELL,
    EQUIPMENT,
    TRAP
}