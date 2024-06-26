package com.killergram.killergrambackend.global.exception

import com.killergram.killergrambackend.global.error.exception.ErrorCode.INTERNAL_SERVER_ERROR
import com.killergram.killergrambackend.global.error.exception.KillergramException

object InternalServerError : KillergramException(INTERNAL_SERVER_ERROR)