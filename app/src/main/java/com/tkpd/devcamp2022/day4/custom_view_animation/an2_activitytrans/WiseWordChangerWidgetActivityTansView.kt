package com.tkpd.devcamp2022.day4.custom_view_animation.an2_activitytrans

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.tkpd.devcamp2022.databinding.LayoutWiseWordViewWidgetLayoutBinding
import com.tkpd.devcamp2022.day4.custom_view_animation.uimodel.WiseWordChangerWidgetUiModel
import java.util.Random

class WiseWordChangerWidgetActivityTansView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : CardView(context, attrs) {

    companion object {
        const val TRANSLATION_START = -8f
        const val TRANSLATION_END = 8f
        const val ALPHA_START = 0f
        const val ALPHA_END = 1f
        const val ANIMATION_DURATION = 500L
    }

//    private var binding: LayoutWiseWordViewWidgetLayoutBinding

    private var listWiseWord = listOf(
        WiseWordChangerWidgetUiModel(
            name = "Catherine Pulsifer",
            description = "When looking for wise words, the best ones often come from our elders."
        ),
        WiseWordChangerWidgetUiModel(
            name = "Rick Warren",
            description = "You've heard that it's wise to learn from experience, but it is wiser to learn from the experience of others."
        ),
        WiseWordChangerWidgetUiModel(
            name = "John C. Maxwell",
            description = "We tend to think of great thinkers and innovators as soloists, but the truth is that the greatest innovative thinking doesn't occur in a vacuum. Innovation results from collaboration."
        ),
        WiseWordChangerWidgetUiModel(
            name = "Hermann Hesse",
            description = "Some of us think holding on makes us strong, but sometimes it is letting go."
        ),
        WiseWordChangerWidgetUiModel(
            name = "James Prescott",
            description = "But what I've discovered over time is that some of the wisest people I know have also been some of the most broken people."
        ),
        WiseWordChangerWidgetUiModel(
            name = "Paulo Coelho",
            description = "Don't waste your time with explanations, people only hear what they want to hear."
        ),
        WiseWordChangerWidgetUiModel(
            name = "Les Brown",
            description = "Each of us experiences defeats in life. We can transform defeat into victory if we learn from life’s whuppings."
        ),
        WiseWordChangerWidgetUiModel(
            name = "Audrey Hepburn",
            description = "Nothing is impossible, the word itself says 'I'm possible'!"
        ),
        WiseWordChangerWidgetUiModel(
            name = "Charles F. Stanley",
            description = "What you do and say lives on in the hearts and minds of others, to some degree, with a definite result or consequence."
        ),
        WiseWordChangerWidgetUiModel(
            name = "Neal A. Maxwell",
            description = "Faith in God includes faith in God's timing."
        ),
        WiseWordChangerWidgetUiModel(
            name = "Dave Marcum",
            description = "If we manage ego wisely, we get the upside it delivers followed by strong returns."
        ),
        WiseWordChangerWidgetUiModel(
            name = "Lori Hill",
            description = "For me, a sense of prosperity often comes with less rather than more."
        )
    )

    var onWiseWordClickListener : (WiseWordChangerWidgetUiModel) -> Unit = {}
//    var tvNameWiseWord: TextView
//    var tvDescriptionWiseWord: TextView

//    init {
//        binding = LayoutWiseWordViewWidgetLayoutBinding.inflate(LayoutInflater.from(context), this, true)
//
//        /**
//         * (Activity Transition - 1) Change property custom view to public, so they can be accessed
//         */
//        tvNameWiseWord = binding.customvWiseWord.tvName
//        tvDescriptionWiseWord = binding.customvWiseWord.tvDescription
//
//        setWiseWord(listWiseWord.first())
//
//        val alphaAnimation = ObjectAnimator
//            .ofFloat(binding.customvWiseWord, View.ALPHA, ALPHA_END)
//            .setDuration(ANIMATION_DURATION)
//
//        val translationAnimation = ObjectAnimator
//            .ofFloat(binding.customvWiseWord, TRANSLATION_X, TRANSLATION_START, TRANSLATION_END)
//            .setDuration(ANIMATION_DURATION).apply {
//                repeatCount = ObjectAnimator.INFINITE
//                repeatMode = ObjectAnimator.REVERSE
//            }
//
//        setAlphaAnimationListener(alphaAnimation, translationAnimation)
//        setOnButtonClickListener(alphaAnimation)
//        setOnWiseWordClickListener()
//    }
//
//    private fun setAlphaAnimationListener(alphaAnimation: ObjectAnimator, translationAnimation: ObjectAnimator) {
//        alphaAnimation.addListener(object : AnimatorListenerAdapter() {
//            override fun onAnimationStart(animation: Animator?) {
//                translationAnimation.start()
//            }
//
//            override fun onAnimationEnd(animation: Animator?) {
//                alphaAnimation.cancel()
//            }
//        })
//    }
//
//    private fun setOnButtonClickListener(alphaAnimation: ObjectAnimator) {
//        val random = Random()
//        binding.customvButton.onClickListener = {
//            val wise = listWiseWord[random.nextInt(listWiseWord.size)]
//
//            binding.customvWiseWord.alpha = ALPHA_START
//            alphaAnimation.start()
//            setWiseWord(wise)
//        }
//    }
//
//    private fun setOnWiseWordClickListener() {
//        binding.customvWiseWord.setOnClickListener {
//            /**
//             * (Activity Transition - 2) Get textName and textDescription and put into extras
//             */
//            onWiseWordClickListener.invoke(WiseWordChangerWidgetUiModel(
//                name = binding.customvWiseWord.textName,
//                description = binding.customvWiseWord.textDescription
//            ))
//        }
//    }
//
//    private fun setWiseWord(wiseWord: WiseWordChangerWidgetUiModel) {
//        binding.customvWiseWord.textName = wiseWord.name
//        binding.customvWiseWord.textDescription = wiseWord.description
//    }
}
