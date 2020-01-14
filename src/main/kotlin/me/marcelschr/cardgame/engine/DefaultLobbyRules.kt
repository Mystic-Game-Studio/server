package me.marcelschr.cardgame.engine

/**
 * Default set of rules for all matches that don't specifically specify any
 * custom rules.
 */
object DefaultLobbyRules : LobbyRules(
    400,
    800,
    5,
    1,
    8,
    2,
    5,
    5
)