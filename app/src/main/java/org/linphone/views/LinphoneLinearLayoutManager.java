package org.linphone.views;
/*
LinphoneLinearLayoutManager.java
Copyright (C) 2019 Belledonne Communications, Grenoble, France

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

/* https://stackoverflow.com/questions/30220771/recyclerview-inconsistency-detected-invalid-item-position */
public class LinphoneLinearLayoutManager extends LinearLayoutManager {
    /**
     * Disable predictive animations. There is a bug in RecyclerView which causes views that are
     * being reloaded to pull invalid ViewHolders from the internal recycler stack if the adapter
     * size has decreased since the ViewHolder was recycled.
     */
    @Override
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public LinphoneLinearLayoutManager(Context context) {
        super(context);
    }

    public LinphoneLinearLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public LinphoneLinearLayoutManager(
            Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
