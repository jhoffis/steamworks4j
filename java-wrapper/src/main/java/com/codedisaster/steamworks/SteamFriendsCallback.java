package com.codedisaster.steamworks;

public interface SteamFriendsCallback {

	void onSetPersonaNameResponse(boolean success, boolean localSuccess, SteamResult result);

	void onPersonaStateChange(SteamID steamID, SteamFriends.PersonaChange change);

	void onGameOverlayActivated(boolean active);

	void onGameLobbyJoinRequested(SteamID steamIDLobby, SteamID steamIDFriend);

	void onAvatarImageLoaded(SteamID steamID, int image, int width, int height);
}
