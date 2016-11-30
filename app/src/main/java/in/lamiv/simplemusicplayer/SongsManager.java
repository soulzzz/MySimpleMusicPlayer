package in.lamiv.simplemusicplayer;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SongsManager {

	public static ArrayList<HashMap<String, String>> allSongsList = new ArrayList<HashMap<String, String>>();

    public ArrayList<HashMap<String, String>> scanDeviceForMpFiles(Context context){
        if(allSongsList.size() != 0)
            return allSongsList;

		String selection = MediaStore.Audio.Media.IS_MUSIC + " != 0";
		String[] projection = {
				MediaStore.Audio.Media.TITLE,
				MediaStore.Audio.Media.DATA
		};
		final String sortOrder = MediaStore.Audio.AudioColumns.TITLE + " COLLATE LOCALIZED ASC";
		List<String> mp3Files = new ArrayList<String>();

		Cursor cursor = null;
		try {
			Uri uri = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
			cursor = context.getContentResolver().query(uri, projection, selection, null, sortOrder);
			if( cursor != null){
				cursor.moveToFirst();

				while( !cursor.isAfterLast() ){
					String title = cursor.getString(0);
					String path = cursor.getString(1);
					cursor.moveToNext();
					if(path != null && path.endsWith(".mp3")) {
						mp3Files.add(path);

                        HashMap<String, String> song = new HashMap<String, String>();
                        song.put("songTitle", title);
                        song.put("songPath", path);

                        // Adding each song to SongList
                        allSongsList.add(song);
					}
				}

			}

			// print to see list of mp3 files
			for( String file : mp3Files) {
				Log.i("TAG", file);
			}

		} catch (Exception e) {
			Log.e("TAG", e.toString());
		}finally{
			if( cursor != null){
				cursor.close();
			}
		}
		return allSongsList;
	}
}
