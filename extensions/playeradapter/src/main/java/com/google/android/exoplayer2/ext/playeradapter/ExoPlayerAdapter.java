/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer2.ext.playeradapter;

import android.support.v17.leanback.media.PlaybackGlueHost;
import android.support.v17.leanback.media.PlayerAdapter;

/**
 * TODO: Add documentation
 */
public class ExoPlayerAdapter extends PlayerAdapter {

  // TODO: The methods below need to be implemented using ExoPlayer

  // TODO: Call appropriate methods of PlayerAdapter.Callback via getCallback()

  @Override
  public boolean isPrepared() {
    return super.isPrepared();
  }

  @Override
  public void seekTo(long positionInMs) {
    super.seekTo(positionInMs);
  }

  @Override
  public void setProgressUpdatingEnabled(boolean enable) {
    super.setProgressUpdatingEnabled(enable);
  }

  @Override
  public boolean isPlaying() {
    return super.isPlaying();
  }

  @Override
  public long getDuration() {
    return super.getDuration();
  }

  @Override
  public long getCurrentPosition() {
    return super.getCurrentPosition();
  }

  @Override
  public long getBufferedPosition() {
    return super.getBufferedPosition();
  }

  @Override
  public void onAttachedToHost(PlaybackGlueHost host) {
    super.onAttachedToHost(host);
  }

  @Override
  public void onDetachedFromHost() {
    super.onDetachedFromHost();
  }

  @Override
  public void play() {
  }

  @Override
  public void pause() {
  }
}
