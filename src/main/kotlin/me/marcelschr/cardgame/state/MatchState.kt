package me.marcelschr.cardgame.state

import me.marcelschr.cardgame.state.TeamState

/**
 * MatchState presents all state of a single match between players. The state
 * must never be fully exposed to API consumers, as this would allow
 * client-side cheating.
 *
 * The TeamStates either reflect two players or two teams. Even though the
 * match-ups are 1 vs. 1, teammatches are planned and were therefore already
 * being taken into consideration in the data structure.
 */
class MatchState(
    val fieldOne: TeamState,
    val fieldTwo: TeamState
) {
}