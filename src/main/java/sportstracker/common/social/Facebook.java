package sportstracker.common.social;

import sportstracker.common.social.model.facebook.FacebookProfile;

/**
 * Facebook api binding
 */
public class Facebook extends ApiBinding {

    private static final String GRAPH_API_BASE_URL =
            "https://graph.facebook.com/v3.0";

    public Facebook(String accessToken) {
        super(accessToken);
    }

    public FacebookProfile getProfile() {
        return restTemplate.getForObject(
                GRAPH_API_BASE_URL + "/me?fields=id,email,name,picture,birthday,favorite_athletes,favorite_teams", FacebookProfile.class);
    }

}
