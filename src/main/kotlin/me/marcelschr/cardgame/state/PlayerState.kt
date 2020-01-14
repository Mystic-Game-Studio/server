package me.marcelschr.cardgame.state

import me.marcelschr.cardgame.engine.Card

/**
 * Player represents a match-participant, meaning a member of a TeamState
 * which belongs to a MatchState. A Player holds just his personal state. The
 * rest of the state is part of either the team or the match.
 */
class PlayerState(
    /**
     * This is the players display / user name.
     */
    val name: String,

    /**
     * Deck chosen by the player. A shallow copy of this list will be made.
     */
    deck: List<Card>
) {
    /**
     * Hand always the reflects the cards that the player is currently holding
     * in their hand. The hand is separate from the lobby, as there could
     * theoretically be more than two players in one lobby.
     */
    val hand: MutableList<CardState> = ArrayList()

    /**
     * This value initially contains the full deck. Gradually going smaller as
     * the player draws cards. Currently there's no need for remembering the
     * whole deck. The deck is also separate from the lobby, as there could
     * theoretically be more than two players in one lobby.
     */
    val deck: MutableList<CardState>

    /**
     * Initial deck, before cards were drawn, removed or such. Note that these
     * aren't CardStates, but actual Cards.
     */
    val initialDeck: List<Card>

    init {
        this.deck = ArrayList(deck.size)
        initialDeck = ArrayList(deck)
        for (card in deck) {
            this.deck.add(CardState(card))
        }
    }
}