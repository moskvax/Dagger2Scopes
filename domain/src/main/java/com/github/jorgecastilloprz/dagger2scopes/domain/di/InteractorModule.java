/*
 * Copyright (C) 2015 Jorge Castillo Pérez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jorgecastilloprz.dagger2scopes.domain.di;

import com.github.jorgecastilloprz.dagger2scopes.domain.interactors.applist.GetInstalledApps;
import com.github.jorgecastilloprz.dagger2scopes.domain.interactors.applist.GetInstalledAppsInteractor;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * @author Jorge Castillo Pérez
 */
@Module(
    library = true, complete = false) public class InteractorModule {

  @Provides @Singleton GetInstalledApps provideGetInstalledAppsInteractor(
      GetInstalledAppsInteractor interactor) {
    return interactor;
  }
}