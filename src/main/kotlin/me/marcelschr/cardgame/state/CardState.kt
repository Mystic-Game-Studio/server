package me.marcelschr.cardgame.state

import me.marcelschr.cardgame.engine.Card

/**
 * A CardState represents a card that is being used in a match. Since card
 * stats and such might change during a game, we have an extra object for
 * holding such changes. This will allow caching the cards and not having
 * to duplicate them.
 */
class CardState(val card: Card) {
    //TODO List of Buffs, Debuffs ... (Changes)?
}