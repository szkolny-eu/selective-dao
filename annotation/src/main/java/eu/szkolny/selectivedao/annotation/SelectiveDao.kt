/*
 * Copyright (c) Kuba Szczodrzyński 2020-3-28.
 */

package eu.szkolny.selectivedao.annotation

import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class SelectiveDao(
    val db: KClass<*>
)
