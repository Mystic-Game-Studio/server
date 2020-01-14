package me.marcelschr.cardgame.state

/**
 * TeamState reflects all state that is important for a team of players. The
 * team size doesn't matter. Even a team size of 1 is valid. A Team can could
 * also be defined as a "competing party".
 */
class TeamState(
    /**
     * The teams life-points. If these drop to 0, this team loses the match.
     */
    var lifepoints: Int,
    /**
     * The teams players. This can theoretically be an unlimited amount of
     * players, since it won't drastically change any rules of the match.
     */
    val players: List<PlayerState>
) {

    /**
     * The utility zones is where the player places utility card. Those are
     * spellcards and trapcards.
     */
    val utilityZone = Array<CardState?>(5) { null }
    /**
     * The creature zone is where creatures are placed.
     */
    val creatureZone = Array<CardState?>(5) { null }
}