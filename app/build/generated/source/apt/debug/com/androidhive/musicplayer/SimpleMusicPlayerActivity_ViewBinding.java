// Generated code from Butter Knife. Do not modify!
package com.androidhive.musicplayer;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SimpleMusicPlayerActivity_ViewBinding<T extends SimpleMusicPlayerActivity> implements Unbinder {
  protected T target;

  @UiThread
  public SimpleMusicPlayerActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.btnPlay = Utils.findRequiredViewAsType(source, R.id.btnPlay, "field 'btnPlay'", ImageButton.class);
    target.btnForward = Utils.findRequiredViewAsType(source, R.id.btnForward, "field 'btnForward'", ImageButton.class);
    target.btnBackward = Utils.findRequiredViewAsType(source, R.id.btnBackward, "field 'btnBackward'", ImageButton.class);
    target.btnNext = Utils.findRequiredViewAsType(source, R.id.btnNext, "field 'btnNext'", ImageButton.class);
    target.btnPrevious = Utils.findRequiredViewAsType(source, R.id.btnPrevious, "field 'btnPrevious'", ImageButton.class);
    target.btnPlaylist = Utils.findRequiredViewAsType(source, R.id.btnPlaylist, "field 'btnPlaylist'", ImageButton.class);
    target.btnRepeat = Utils.findRequiredViewAsType(source, R.id.btnRepeat, "field 'btnRepeat'", ImageButton.class);
    target.btnShuffle = Utils.findRequiredViewAsType(source, R.id.btnShuffle, "field 'btnShuffle'", ImageButton.class);
    target.songProgressBar = Utils.findRequiredViewAsType(source, R.id.songProgressBar, "field 'songProgressBar'", SeekBar.class);
    target.songTitleLabel = Utils.findRequiredViewAsType(source, R.id.songTitle, "field 'songTitleLabel'", TextView.class);
    target.songCurrentDurationLabel = Utils.findRequiredViewAsType(source, R.id.songCurrentDurationLabel, "field 'songCurrentDurationLabel'", TextView.class);
    target.songTotalDurationLabel = Utils.findRequiredViewAsType(source, R.id.songTotalDurationLabel, "field 'songTotalDurationLabel'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.btnPlay = null;
    target.btnForward = null;
    target.btnBackward = null;
    target.btnNext = null;
    target.btnPrevious = null;
    target.btnPlaylist = null;
    target.btnRepeat = null;
    target.btnShuffle = null;
    target.songProgressBar = null;
    target.songTitleLabel = null;
    target.songCurrentDurationLabel = null;
    target.songTotalDurationLabel = null;

    this.target = null;
  }
}
