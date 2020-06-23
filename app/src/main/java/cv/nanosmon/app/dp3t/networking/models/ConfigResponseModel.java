/*
 * Copyright (c) 2020 Ubique Innovation AG <https://www.ubique.ch>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */
package cv.nanosmon.app.dp3t.networking.models;

public class ConfigResponseModel {

	private boolean forceUpdate;
	private InfoBoxModelCollection infoBox;
	private SdkConfigModel androidGaenSdkConfig;

	public boolean getDoForceUpdate() {
		return forceUpdate;
	}

	public InfoBoxModelCollection getInfoBox() {
		return infoBox;
	}

	public InfoBoxModel getInfoBox(String languageKey) {
		return infoBox.getInfoBox(languageKey);
	}

	public SdkConfigModel getSdkConfig() {
		return androidGaenSdkConfig;
	}

}