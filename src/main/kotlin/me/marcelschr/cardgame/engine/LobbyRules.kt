package me.marcelschr.cardgame.engine

/**
 * LobbyRules is a set of constraints, defaults and initial settings that
 * the MatchState, TeamState and the CardEngine will use for deciding which
 * actions are legal and what the initial properties, such as player health
 * will look like
 */
open class LobbyRules(
    val baseLifepoints: Int,
    val maxLifepoints: Int,
    val initialHandSize: Int,
    val drawPerRound: Int,
    val maxHandCards: Int,
    val maxDuplicateCount: Int,
    val creatureZoneSize: Int,
    val spellAndTrapZoneSize: Int
) {
}