package resumade.kshitijchauhan.haroldadmin.com.resumade.di.components

import dagger.Component
import resumade.kshitijchauhan.haroldadmin.com.resumade.ui.MainActivity
import resumade.kshitijchauhan.haroldadmin.com.resumade.ResumadeApplication
import resumade.kshitijchauhan.haroldadmin.com.resumade.di.AppScope
import resumade.kshitijchauhan.haroldadmin.com.resumade.di.modules.ContextModule
import resumade.kshitijchauhan.haroldadmin.com.resumade.di.modules.RetrofitModule

@AppScope
@Component(modules = [ContextModule::class, RetrofitModule::class])
interface AppComponent {

    fun inject(app: ResumadeApplication)
    fun inject(mainActivity: MainActivity)

}