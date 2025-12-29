package behavioural.iterator;

import java.util.List;

public class YoutubePlaylistIterator implements PlaylistIterator{
    private List<Video> videos;
    int pos;

    public YoutubePlaylistIterator(List<Video> videos){
        this.videos = videos;
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos < videos.size();
    }

    @Override
    public Video next() {
        return hasNext() ? videos.get(pos++) : null;
    }
}
